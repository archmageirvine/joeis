package irvine.oeis.a078;

import irvine.oeis.FiniteSequence;

/**
 * A078871 Decimal concatenations of the 6-tuples (d1,d2,d3,d4,d5,d6) with elements in {2,4,6} for which there exists a prime p &gt;= 7 such that the differences between the 7 consecutive primes starting with p are (d1,d2,d3,d4,d5,d6).
 * @author Georg Fischer
 */
public class A078871 extends FiniteSequence {

  /** Construct the sequence. */
  public A078871() {
    super(1, FINITE, 242462, 246264, 246266, 246626, 264242, 264246, 264264, 264626, 264666, 266424, 266466, 266646, 424626, 424662, 462462, 462642, 462646, 462664, 462666, 466264, 466266, 466626, 624626, 626424, 626426, 626462, 626466, 626642, 626646, 626664, 642462, 642466, 642646, 646246, 646264, 646266, 646626, 646662, 662642, 662646, 662664, 662666, 664246, 664626, 664662, 666264, 666266, 666462);
  }
}
