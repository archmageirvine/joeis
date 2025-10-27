package irvine.oeis.a046;

import irvine.oeis.InverseSequence;
import irvine.oeis.a000.A000001;

/**
 * A046057 Smallest order m &gt; 0 for which there are n nonisomorphic finite groups of order m, or 0 if no such order exists.
 * @author Sean A. Irvine
 */
public class A046057 extends InverseSequence {

  /** Construct the sequence. */
  public A046057() {
    super(1, new A000001());
  }
}

