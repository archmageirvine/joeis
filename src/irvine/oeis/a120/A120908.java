package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120908 Sum of the lengths of the drops in all ternary words of length n on {0,1,2}. The drops of a ternary word on {0,1,2} are the subwords 10,20 and 21, their lengths being the differences 1, 2 and 1, respectively.
 * @author Sean A. Irvine
 */
public class A120908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120908() {
    super(new long[] {-9, 6}, new long[] {0, 4});
  }
}
