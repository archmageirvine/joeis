package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178571 <code>a(n) =</code> number of 5-digit primes with digit sum <code>n,</code> where n runs through the non-multiples of 3 in the range <code>[2</code>..44].
 * @author Georg Fischer
 */
public class A178571 extends FiniteSequence {

  /** Construct the sequence. */
  public A178571() {
    super(0, 4, 12, 28, 45, 95, 143, 236, 272, 411, 479, 630, 664, 742, 757, 741, 706, 580, 528, 379, 341, 205, 166, 84, 62, 34, 13, 4, 2);
  }
}
