package irvine.oeis.a050;

import irvine.oeis.MemorySequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a034.A034706;

/**
 * A050936 Sum of two or more consecutive prime numbers.
 * @author Sean A. Irvine
 */
public class A050936 extends A034706 {

  /** Construct the sequence. */
  public A050936() {
    super(2, MemorySequence.cachedSequence(new A000040()));
  }
}
