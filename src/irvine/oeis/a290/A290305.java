package irvine.oeis.a290;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A290305 Number of 5-dimensional polyominoes with n cells (regarding mirror-images as distinct).
 * @author Sean A. Irvine
 */
public class A290305 implements Sequence {

  // Cf. A255487 (4-dimensional case)
  // Coordinate (w,x,y,z,v) is five 6-bit numbers packed into a int

  private static final int SHIFT1 = 6;
  private static final int SHIFT2 = 2 * SHIFT1;
  private static final int SHIFT3 = 3 * SHIFT1;
  private static final int SHIFT4 = 4 * SHIFT1;
  private static final int W_COORD = 1;
  private static final int X_COORD = W_COORD << SHIFT1;
  private static final int Y_COORD = X_COORD << SHIFT1;
  private static final int Z_COORD = Y_COORD << SHIFT1;
  private static final int V_COORD = Z_COORD << SHIFT1;
  private static final int END_COORD = V_COORD << SHIFT1;
  private static final int W_MASK = X_COORD - W_COORD;
  private static final int X_MASK = Y_COORD - X_COORD;
  private static final int Y_MASK = Z_COORD - Y_COORD;
  private static final int Z_MASK = V_COORD - Z_COORD;
  private static final int V_MASK = END_COORD - V_COORD;

  protected static class FiveDPackedPolyomino {

    private final int[] mCoords;
    private int mMin;
    private int mMax;

    FiveDPackedPolyomino(final int size) {
      mCoords = new int[size];
    }

    FiveDPackedPolyomino copy() {
      final FiveDPackedPolyomino p = new FiveDPackedPolyomino(mCoords.length);
      System.arraycopy(mCoords, 0, p.mCoords, 0, mCoords.length);
      p.mMin = mMin;
      p.mMax = mMax;
      return p;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof FiveDPackedPolyomino && Arrays.equals(mCoords, ((FiveDPackedPolyomino) obj).mCoords);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mCoords);
    }

    private void updateExtrema(final int newco) {
      if ((newco & W_MASK) < (mMin & W_MASK)) {
        mMin = (mMin & ~W_MASK) | (newco & W_MASK);
      }
      if ((newco & W_MASK) > (mMax & W_MASK)) {
        mMax = (mMax & ~W_MASK) | (newco & W_MASK);
      }
      if ((newco & X_MASK) < (mMin & X_MASK)) {
        mMin = (mMin & ~X_MASK) | (newco & X_MASK);
      }
      if ((newco & X_MASK) > (mMax & X_MASK)) {
        mMax = (mMax & ~X_MASK) | (newco & X_MASK);
      }
      if ((newco & V_MASK) < (mMin & V_MASK)) {
        mMin = (mMin & ~V_MASK) | (newco & V_MASK);
      }
      if ((newco & V_MASK) > (mMax & V_MASK)) {
        mMax = (mMax & ~V_MASK) | (newco & V_MASK);
      }
      if ((newco & Y_MASK) < (mMin & Y_MASK)) {
        mMin = (mMin & ~Y_MASK) | (newco & Y_MASK);
      }
      if ((newco & Y_MASK) > (mMax & Y_MASK)) {
        mMax = (mMax & ~Y_MASK) | (newco & Y_MASK);
      }
      if ((newco & Z_MASK) < (mMin & Z_MASK)) {
        mMin = (mMin & ~Z_MASK) | (newco & Z_MASK);
      }
      if ((newco & Z_MASK) > (mMax & Z_MASK)) {
        mMax = (mMax & ~Z_MASK) | (newco & Z_MASK);
      }
    }

    // Use comparators only on size-Size polys.
    /* set<Poly> and canonicalize() use operator<
       It's an arbitrary but consistent ordering. */
    boolean lt(final FiveDPackedPolyomino rhs) {
      for (int k = 0; k < mCoords.length; ++k) {
        final int c = Integer.compare(mCoords[k], rhs.mCoords[k]);
        if (c != 0) {
          return c > 0;
        }
      }
      return false;
    }

    private void move(final int displ) {
      for (int cx = 0; cx < mCoords.length; cx += 1) {
        mCoords[cx] += displ;
      }
      mMin += displ;
      mMax += displ;
    }

    private String co5String(final int co) {
      return (co & W_MASK) + " " + ((co & X_MASK) >>> SHIFT1) + " " + ((co & Y_MASK) >>> SHIFT2) + " " + ((co & Z_MASK) >>> SHIFT3) + " " + ((co & V_MASK) >>> SHIFT4);
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder();
      for (final int co : mCoords) {
        sb.append(" [").append(co5String(co)).append(']');
      }
      sb.append(" {").append(co5String(mMin)).append("} {").append(co5String(mMax)).append('}');
      return sb.toString();
    }

    private FiveDPackedPolyomino rotate(final FiveDPackedPolyomino canon, final int mask1, final int mask2, final int shift1) {
      final int wmax = mMax & mask1;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & (~mask1 & ~mask2))
          | ((wmax - (mCoords[cx] & mask1)) << shift1)
          | ((mCoords[cx] & mask2) >> shift1);
      }
      mMax = (mMax & (~mask1 & ~mask2))
        | (wmax << shift1)
        | ((mMax & mask2) >> shift1);
      Arrays.sort(mCoords);
      return lt(canon) ? copy() : canon;
    }

    private FiveDPackedPolyomino rotWtoX(final FiveDPackedPolyomino canon) {
      return rotate(canon, W_MASK, X_MASK, SHIFT1);
    }

    private FiveDPackedPolyomino rotWtoY(final FiveDPackedPolyomino canon) {
      return rotate(canon, W_MASK, Y_MASK, SHIFT2);
    }

    private FiveDPackedPolyomino rotWtoZ(final FiveDPackedPolyomino canon) {
      return rotate(canon, W_MASK, Z_MASK, SHIFT3);
    }

    private FiveDPackedPolyomino rotXtoY(final FiveDPackedPolyomino canon) {
      return rotate(canon, X_MASK, Y_MASK, SHIFT1);
    }

    private FiveDPackedPolyomino rotYtoX(final FiveDPackedPolyomino canon) {
      final int ymax = mMax & Y_MASK;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & (~X_MASK & ~Y_MASK))
          | ((ymax - (mCoords[cx] & Y_MASK)) >> SHIFT1)
          | ((mCoords[cx] & X_MASK) << SHIFT1);
      }
      mMax = (mMax & (~X_MASK & ~Y_MASK))
        | (ymax >> SHIFT1)
        | ((mMax & X_MASK) << SHIFT1);
      Arrays.sort(mCoords);
      return lt(canon) ? copy() : canon;
    }

    private FiveDPackedPolyomino rotXtoZ(final FiveDPackedPolyomino canon) {
      return rotate(canon, X_MASK, Z_MASK, SHIFT2);
    }

    private FiveDPackedPolyomino rotWtoV(final FiveDPackedPolyomino canon) {
      return rotate(canon, W_MASK, V_MASK, SHIFT4);
    }

    private FiveDPackedPolyomino rotXtoV(final FiveDPackedPolyomino canon) {
      return rotate(canon, X_MASK, V_MASK, SHIFT3);
    }

    private FiveDPackedPolyomino rotYtoV(final FiveDPackedPolyomino canon) {
      return rotate(canon, Y_MASK, V_MASK, SHIFT2);
    }

    private FiveDPackedPolyomino do2D(final FiveDPackedPolyomino canon) {
      return rotWtoX(rotWtoX(rotWtoX(canon)));
    }

    private FiveDPackedPolyomino do3D(final FiveDPackedPolyomino canon) {
      return do2D(rotWtoY(do2D(rotYtoX(do2D(rotXtoY(do2D(rotXtoY(do2D(rotWtoY(do2D(canon)))))))))));
    }

    private FiveDPackedPolyomino do4D(final FiveDPackedPolyomino canon) {
      return do3D(rotXtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(rotXtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(canon)))))))))))))));
    }

    private FiveDPackedPolyomino do5D(final FiveDPackedPolyomino canon) {
      return do4D(rotWtoV(do4D(rotWtoV(do4D(rotXtoV(do4D(rotXtoV(do4D(rotWtoV(do4D(rotWtoV(do4D(rotYtoV(do4D(rotXtoV(do4D(rotXtoV(do4D(canon)))))))))))))))))));
    }

    private void flipW() {
      final int wmax = mMax & W_MASK;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & ~W_MASK) | (wmax - (mCoords[cx] & W_MASK));
      }
      Arrays.sort(mCoords);
    }

    FiveDPackedPolyomino canonicalize() {
      final FiveDPackedPolyomino po = copy();
      po.move(-po.mMin);
      Arrays.sort(po.mCoords);
      return po.do5D(po.copy());
    }

    /**
     * Test if the polyomino is symmetric
     * @return true if symmetric
     */
    public boolean isSymmetric() {
      FiveDPackedPolyomino fl = copy();
      fl.flipW();
      fl = fl.canonicalize();
      return equals(fl);
    }

    private void expandPoly(final HashSet<FiveDPackedPolyomino> polys) {
      final int prevSize = mCoords.length;
      move(W_COORD + X_COORD + Y_COORD + Z_COORD + V_COORD);
      // so that all adjacent cells exist
      final HashSet<Integer> cellset = new HashSet<>();
      for (final int p : mCoords) {
        cellset.add(p);
      }
      final FiveDPackedPolyomino expo = new FiveDPackedPolyomino(mCoords.length + 1);
      System.arraycopy(mCoords, 0, expo.mCoords, 0, mCoords.length);
      expo.mMin = mMin;
      expo.mMax = mMax;
      for (int cx = 0; cx < prevSize; cx += 1) {
        final int co = mCoords[cx];
        for (int delta = W_COORD; delta != END_COORD; delta <<= SHIFT1) {
          int exco = co + delta;
          expo.mCoords[prevSize] = exco;
          if (cellset.add(exco)) {
            expo.updateExtrema(exco);
            final FiveDPackedPolyomino canon = expo.canonicalize();
            polys.add(canon);
            expo.mMin = mMin;
            expo.mMax = mMax;
          }
          exco = co - delta;
          expo.mCoords[prevSize] = exco;
          if (cellset.add(exco)) {
            expo.updateExtrema(exco);
            final FiveDPackedPolyomino canon = expo.canonicalize();
            polys.add(canon);
            expo.mMin = mMin;
            expo.mMax = mMax;
          }
        }
      }
    }
  }

  private HashSet<FiveDPackedPolyomino> mPolysA = null;
  protected HashSet<FiveDPackedPolyomino> mPolysB = null;

  private void expandPolys() {
    for (final FiveDPackedPolyomino poly : mPolysA) {
      poly.expandPoly(mPolysB);
    }
  }

  @Override
  public Z next() {
    if (mPolysB == null) {
      mPolysB = new HashSet<>();
      return Z.ONE;
    }
    if (mPolysB.isEmpty()) {
      final FiveDPackedPolyomino po = new FiveDPackedPolyomino(1);
      po.mCoords[0] = 0;
      po.mMin = 0;
      po.mMax = 0;
      mPolysB.add(po);
    } else {
      mPolysA = mPolysB;
      mPolysB = new HashSet<>();
      expandPolys();
    }
    return Z.valueOf(mPolysB.size());
  }
}
