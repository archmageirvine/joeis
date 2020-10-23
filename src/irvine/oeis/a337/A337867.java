package irvine.oeis.a337;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036225.
 * @author Sean A. Irvine
 */
public class A337867 implements Sequence {

	// After George Sicherman C program

	private static final int[] REFL_BITS = {
		0, 1, 4, 5, 2, 3, 6, 7, 8, 9, 12, 13, 10, 11, 14, 15
	};
	private static final int[] ROT_BITS = {
		0, 2, 8, 10, 1, 3, 9, 11, 4, 6, 12, 14, 5, 7, 13, 15
	};

	private int mN = 0;
	private HashMap<String, Cell[]> mRetained = new HashMap<>();

	private static final class Cell implements Comparable<Cell> {
		private int mX;
		private int mY;
		private int mSector;

		@Override
		public int compareTo(final Cell b) {
			int d = Integer.compare(mY, b.mY);
			if (d != 0) {
				return d;
			}
			d = Integer.compare(mX, b.mX);
			if (d != 0) {
				return d;
			}
			return Integer.compare(mSector, b.mSector);
		}

		@Override
		public String toString() {
			return "(" + mX + "," + mY + "," + mSector + ")";
		}
	}

	int mNCells;
	boolean xflag;
	int nwcells;
	int nbcells;
	final Cell[] mCells = new Cell[100];
	final Cell[] wcells = new Cell[100];
	final Cell[] bcells = new Cell[100];

	{
		for (int k = 0; k < 100; ++k) {
			mCells[k] = new Cell();
			wcells[k] = new Cell();
			bcells[k] = new Cell();
		}
	}

	private void add(final int xnew, final int ynew, final int sector) {
		if (sector != 0) {
			mCells[mNCells].mX = xnew;
			mCells[mNCells].mY = ynew;
			mCells[mNCells].mSector = sector;
			mNCells++;
		}
		canonize();      /* Writes into bcells[] */
		show();        /* Prints the contents */

		if (sector != 0) {
			mNCells--;    /* Restore the cell count. */
		}
	}

	/* Turn a polyabolo all different ways and choose the lexically first. */
	private void canonize() {
		nwcells = mNCells;
		for (int c = 0; c < mNCells; c++) {
			wcells[c].mX = mCells[c].mX;
			wcells[c].mY = mCells[c].mY;
			wcells[c].mSector = mCells[c].mSector;
		}

		nbcells = 0;
		for (int refl = 0; refl < 2; refl++) {
			for (int rot = 0; rot < 4; rot++) {
				int ymin = Integer.MAX_VALUE;
				int xmin = Integer.MAX_VALUE;
				for (int c = 0; c < nwcells; c++) {
					if (wcells[c].mX < xmin) {
						xmin = wcells[c].mX;
					}
					if (wcells[c].mY < ymin) {
						ymin = wcells[c].mY;
					}
				}
				for (int c = 0; c < nwcells; c++) {
					wcells[c].mX -= xmin;
					wcells[c].mY -= ymin;
				}
				Arrays.sort(wcells, 0, nwcells);

				if (nbcells == 0 || lexBefore()) {
					nbcells = nwcells;
					for (int c = 0; c < nwcells; c++) {
						bcells[c].mX = wcells[c].mX;
						bcells[c].mY = wcells[c].mY;
						bcells[c].mSector = wcells[c].mSector;
					}
				}
				// Rotate
				for (int c = 0; c < nwcells; c++) {
					final int t = wcells[c].mY;
					wcells[c].mY = -wcells[c].mX;
					wcells[c].mX = t;
					wcells[c].mSector = ROT_BITS[wcells[c].mSector];
				}
			}
			// Reflect
			for (int c = 0; c < nwcells; c++) {
				wcells[c].mX = -wcells[c].mX;
				wcells[c].mSector = REFL_BITS[wcells[c].mSector];
			}
		}
	}

	// Compare the current working polyabolo lexically to the "best" one. */
	private boolean lexBefore() {
		for (int c = 0; c < nwcells; c++) {
			final int d = wcells[c].compareTo(bcells[c]);
			if (d > 0) {
				return false;
			}
			if (d < 0) {
				return true;
			}
		}
		return false;  // identical
	}


	private boolean vacant(int x, int y) {
		for (int c = 0; c < mNCells; c++) {
			if (mCells[c].mX == x && mCells[c].mY == y) {
				return false;
			}
		}
		return true;
	}

	private String toString(final Cell[] b, final int cnt) {
		final StringBuilder sb = new StringBuilder();
		for (int c = 0; c < cnt; ++c) {
			sb.append(b[c]);
		}
		return sb.toString();
	}

	private Cell[] deepCopy(final Cell[] cells, final int nc) {
		final Cell[] copy = new Cell[nc];
		for (int k = 0; k < nc; ++k) {
			copy[k] = new Cell();
			copy[k].mX = cells[k].mX;
			copy[k].mY = cells[k].mY;
			copy[k].mSector = cells[k].mSector;
		}
		return copy;
	}

	private void show() {
		mRetained.put(toString(bcells, nbcells), deepCopy(bcells, nbcells));
	}

	@Override
	public Z next() {
		if (++mN > 99) {
			throw new UnsupportedOperationException();
		}
		xflag = true; // polyfetts , false for polyaboloes

		if (mRetained.isEmpty()) {
			final Cell t = new Cell();
			t.mX = 0;
			t.mY = 0;
			t.mSector = 3;
			mRetained.put(toString(mCells, 1), new Cell[] {t});
			return Z.ONE;
		} else {
			Collection<Cell[]> values = mRetained.values();
			mRetained = new HashMap<>();
			for (final Cell[] r : values) {
				for (int k = 0; k < r.length; ++k) {
					mCells[k].mX = r[k].mX;
					mCells[k].mY = r[k].mY;
					mCells[k].mSector = r[k].mSector;
				}
				mNCells = r.length;

				//System.out.println("Starting: " + toString(r, r.length));

				// Adjoin a monabolo.
				for (int c = 0; c < mNCells; c++) {
					int x = mCells[c].mX;
					int y = mCells[c].mY;
					int v = mCells[c].mSector;
					if (v != 0x0 && v != 0xf) {  /* fill out the cell */
						mCells[c].mSector = 0xf;
						add(0, 0, 0);    /* 0 means change nothing */
						mCells[c].mSector = v;  /* restore the value */
					}

					// Neighbor cell adjacencies.  Use a whole separate clause for -x.
					if (xflag) {
						// todo subclass -x case
						// Orthogonal moves
						if ((v & 0x7) != 0) {  /* go down */
							final int ynew = y + 1;
							if (vacant(x, ynew)) {
								add(x, ynew, 0xc);
								add(x, ynew, 0xa);
								if ((v & 0x2) != 0) {
									add(x, ynew, 0x3);
								}
								if ((v & 0x4) != 0) {
									add(x, ynew, 0x5);
								}
							}
						}
						if ((v & 0xb) != 0) {  /* go right */
							final int xnew = x + 1;
							if (vacant(xnew, y)) {
								add(xnew, y, 0xc);
								add(xnew, y, 0x5);
								if ((v & 1) != 0) {
									add(xnew, y, 0x3);
								}
								if ((v & 8) != 0) {
									add(xnew, y, 0xa);
								}
							}
						}
						if ((v & 0xd) != 0) {  /* go left */
							final int xnew = x - 1;
							if (vacant(xnew, y)) {
								add(xnew, y, 0xa);
								add(xnew, y, 0x3);
								if ((v & 1) != 0) {
									add(xnew, y, 0x5);
								}
								if ((v & 8) != 0) {
									add(xnew, y, 0xc);
								}
							}
						}
						if ((v & 0xe) != 0) {  /* go up */
							final int ynew = y - 1;
							if (vacant(x, ynew)) {
								add(x, ynew, 0x5);
								add(x, ynew, 0x3);
								if ((v & 2) != 0) {
									add(x, ynew, 0xa);
								}
								if ((v & 4) != 0) {
									add(x, ynew, 0xc);
								}
							}
						}
						// Diagonal moves.
						if ((v & 0x3) != 0) {  /* down right. */
							final int xnew = x + 1;
							final int ynew = y + 1;
							if (vacant(xnew, ynew)) {
								add(xnew, ynew, 0x5);
								add(xnew, ynew, 0xa);
								add(xnew, ynew, 0xc);
							}
						}
						if ((v & 0x5) != 0) {  /* down left. */
							final int xnew = x - 1;
							final int ynew = y + 1;
							if (vacant(xnew, ynew)) {
								add(xnew, ynew, 0x3);
								add(xnew, ynew, 0xa);
								add(xnew, ynew, 0xc);
							}
						}
						if ((v & 0xa) != 0) {  /* up right. */
							final int xnew = x + 1;
							final int ynew = y - 1;
							if (vacant(xnew, ynew)) {
								add(xnew, ynew, 0x3);
								add(xnew, ynew, 0x5);
								add(xnew, ynew, 0xc);
							}
						}
						if ((v & 0xc) != 0) {  /* up left. */
							final int xnew = x - 1;
							final int ynew = y - 1;
							if (vacant(xnew, ynew)) {
								add(xnew, ynew, 0x3);
								add(xnew, ynew, 0x5);
								add(xnew, ynew, 0xa);
							}
						}
					} else {
						if ((v & 0x1) != 0) {  /* go down */
							final int ynew = y + 1;
							if (vacant(x, ynew)) {
								add(x, ynew, 0xc);
								add(x, ynew, 0xa);
							}
						}
						if ((v & 0x2) != 0) {  /* go right */
							final int xnew = x + 1;
							if (vacant(xnew, y)) {
								add(xnew, y, 0xc);
								add(xnew, y, 0x5);
							}
						}
						if ((v & 0x4) != 0) {  /* go left */
							final int xnew = x - 1;
							if (vacant(xnew, y)) {
								add(xnew, y, 0xa);
								add(xnew, y, 0x3);
							}
						}
						if ((v & 0x8) != 0) {  /* go up */
							final int ynew = y - 1;
							if (vacant(x, ynew)) {
								add(x, ynew, 0x5);
								add(x, ynew, 0x3);
							}
						}
					}
				}
			}
		}
		//System.out.println(mRetained);
		return Z.valueOf(mRetained.size());
	}
}
