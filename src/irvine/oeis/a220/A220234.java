package irvine.oeis.a220;

/**
 * A220234 Triangular array read by rows.  T(n,k) is the number of functions f:{1,2,...,n}-&gt;{1,2,...,n} that have exactly k recurrent elements whose preimage contains only one element, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A220234 extends A220222 {
  /** Construct the sequence. */
  public A220234() {
    super(true);
  }
}
