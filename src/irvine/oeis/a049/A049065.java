package irvine.oeis.a049;

import irvine.oeis.RecordSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a048.A048986;

/**
 * A049065 Record primes reached in A048986.
 * @author Sean A. Irvine
 */
public class A049065 extends RecordSequence {

  /** Construct the sequence. */
  public A049065() {
    super(new SkipSequence(new A048986(), 1));
  }
}
