package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092091 Molien series for 9-dimensional group of structure <code>Z_2 X Z_2</code> and order 4, corresponding to complete weight enumerators of Hermitian <code>self-dual GF(3)-linear</code> codes over <code>GF(9)</code>.
 * @author Sean A. Irvine
 */
public class A092091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092091() {
    super(new long[] {1, -5, 6, 10, -29, 9, 36, -36, -9, 29, -10, -6, 5}, new long[] {1, 4, 17, 52, 147, 360, 819, 1712, 3382, 6312, 11286, 19368, 32154});
  }
}
