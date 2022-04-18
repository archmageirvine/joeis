package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056232 Form an array with 3 rows: row 1 begins with 1; all rows are increasing; each entry is sum of 2 entries above it; each number appears at most once; smallest unused number is appended to first row if possible. Sequence gives row 2.
 * @author Sean A. Irvine
 */
public class A056232 extends A056231 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mA[1]);
  }
}

