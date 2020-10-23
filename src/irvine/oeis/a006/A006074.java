package irvine.oeis.a006;

import irvine.oeis.a337.A337867;

/**
 * A006074.
 * @author Sean A. Irvine
 */
public class A006074 extends A337867 {

	@Override
	protected void update(final int x, final int y, final int v) {
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
