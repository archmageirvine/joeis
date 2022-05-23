package irvine.oeis.a056;

import irvine.oeis.InverseSequence;

/**
 * A056018 Inverse permutation to A056017.
 * @author Sean A. Irvine
 */
public class A056018 extends InverseSequence {

  /** Construct the sequence. */
  public A056018() {
    super(new A056017(), 0, 0);
  }
}
