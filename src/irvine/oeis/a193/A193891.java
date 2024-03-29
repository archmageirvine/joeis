package irvine.oeis.a193;
// Generated by gen_seq4.pl 2023-08-09/trimirror at 2023-08-09 20:19

import irvine.oeis.triangle.Transpose;

/**
 * A193891 Triangular array:  the self-fusion of (p(n,x)), where p(n,x)=x^n+2x^(n-1)+3x^(n-2)+...+nx+(n+1).
 * @author Georg Fischer
 */
public class A193891 extends Transpose {

  /** Construct the sequence. */
  public A193891() {
    super(0, new A193892());
  }
}
