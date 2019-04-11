package irvine.oeis.a177;

import irvine.oeis.FiniteSequence;

/**
 * A177686 If <code>a1a2a3</code> is a 3-digit integer in a concatenated form, we define two permutations of its digits as follows: P1(a1a2a3)=a2a3a1 and P2(a1a2a3)=a1a3a2, then we take the absolute value of their difference. Thus we form a sequence: <code>a1a2a3,</code> abs(P1(a1a2a3)-P2(a1a2a3)), and so on.
 * @author Georg Fischer
 */
public class A177686 extends FiniteSequence {

  /** Construct the sequence. */
  public A177686() {
    super(99, 891, 198, 792, 297, 693, 396, 594, 495);
  }
}
