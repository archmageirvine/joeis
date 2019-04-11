package irvine.oeis.a242;

import irvine.oeis.FiniteSequence;

/**
 * A242810 <code>a(n)</code> is the smallest n-digit number whose truncation after its first k digits is divisible by the k-th Lucas number (A000032(n)) for k <code>= 1</code>..n.
 * @author Georg Fischer
 */
public class A242810 extends FiniteSequence {

  /** Construct the sequence. */
  public A242810() {
    super(1, 12, 120, 1204, 12045, 120456, 3689467, 36894671, 368946712L);
  }
}
