package irvine.oeis.a049;

/**
 * A049460 Generalized Stirling number triangle of first kind, row n are coefficients of the polynomial P_{n,r}(x) = (-1)^n*((n+r)!/r!)*Product_{k=1..n} (x - 1/(r+k)), with r = 4.
 * @author Sean A. Irvine
 */
public class A049460 extends A049444 {

  @Override
  protected long add() {
    return 4;
  }
}
