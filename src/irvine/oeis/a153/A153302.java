package irvine.oeis.a153;
// Generated by gen_seq4.pl 2025-03-06.ack/polyz at 2025-03-06 22:47

import irvine.oeis.PolynomialFieldSequence;

/**
 * A153302 G.f.: A(x) = cm4(x)^2 + sm4(x)^2 where cm4(x) and sm4(x) are the g.f.s of A153300 and A153301, respectively, that satisfy cm4(x)^4 - sm4(x)^4 = 1.
 * dif(reversion(integral(1/sqrt(cosh(2*x)))))
 * @author Georg Fischer
 */
public class A153302 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A153302() {
    super(0, "[[1],[0, 2]]", ", 1,p1,cosh,sqrt,/,int,rev,dif", 1, 1, 0, 2);
  }
}
