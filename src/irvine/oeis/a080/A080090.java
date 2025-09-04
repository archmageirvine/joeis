package irvine.oeis.a080;

import irvine.oeis.InverseSequence;

/**
 * A080090 a(n) is the index of the first occurrence of n in A080071, or 0 for those n&gt;0 which never occur in A080071.
 * @author Sean A. Irvine
 */
public class A080090 extends InverseSequence {

  /** Construct the sequence. */
  public A080090() {
    super(0, new A080071(), 0);
  }
}

