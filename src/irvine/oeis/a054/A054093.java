package irvine.oeis.a054;

/**
 * A054093 T(n,n-1), array T as in A054090.
 * @author Georg Fischer
 */
public class A054093 extends A054092 {

  /** Construct the sequence. */
  public A054093() {
    super(1, n -> n + 2);
  }
}
