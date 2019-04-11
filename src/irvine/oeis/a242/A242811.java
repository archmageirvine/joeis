package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242811 <code>a(n)</code> is the largest n-digit number whose truncation after its first k digits is divisible by the k-th Lucas number (A000032(n)) for <code>k = 1..n</code>.
 * @author Georg Fischer
 */
public class A242811 extends FiniteSequence {

  /** Construct the sequence. */
  public A242811() {
    super(9, 99, 996, 9968, 99682, 996822, 9968228, 36894671, 368946712L);
  }
}
