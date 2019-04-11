package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017457 <code>a(n) = (11*n + 5)^9</code>.
 * @author Sean A. Irvine
 */
public class A017457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017457() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 68719476736L, 7625597484987L, 165216101262848L, 1628413597910449L, 10077696000000000L, 45848500718449031L, 167619550409708032L, 520411082988487293L, 1423311812421484544L});
  }
}
