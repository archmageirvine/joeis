package irvine.oeis.a152;

import irvine.oeis.FiniteSequence;

/**
 * A152673 Primes that can be obtained from cyclic permutations of the faces of the &quot;prime cube&quot; (the unique primitive arrangement of eight consecutive digits on a cube&apos;s vertices such that any two adjacent digits of an edge sum to a prime), with leading 0&apos;s omitted.
 * @author Georg Fischer
 */
public class A152673 extends FiniteSequence {

  /** Construct the sequence. */
  public A152673() {
    super(523, 743, 2143, 2341, 2503, 4703, 6521);
  }
}
