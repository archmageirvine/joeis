package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273180 Numbers n such that <code>ror(n) + rol(n)</code> is a power of 2, where ror(n)=A038572(n) is n rotated one binary place to the right, rol(n)=A006257(n) is n rotated one binary place to the left.
 * @author Sean A. Irvine
 */
public class A273180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273180() {
    super(new long[] {-16, 0, 0, 17, 0, 0}, new long[] {1, 2, 6, 19, 38, 102});
  }
}
