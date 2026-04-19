package irvine.oeis.a084;

import irvine.oeis.InverseSequence;

/**
 * A084470 Position of A084468(n) in A084467(n).
 * @author Sean A. Irvine
 */
public class A084470 extends InverseSequence {

  /** Construct the sequence. */
  public A084470() {
    super(1, 1, new A084469(), 1);
  }
}
