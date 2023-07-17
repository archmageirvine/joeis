package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005438 Column of Kempner tableau.
 * @author Sean A. Irvine
 */
public class A005438 extends A005437 {

  /** Construct the sequence. */
  public A005438() {
    super(1);
  }

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return mPrev[(mPrev.length - 1) / 2 + 1];
  }
}

