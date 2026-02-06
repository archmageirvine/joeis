package irvine.oeis.a051;

/**
 * A051379 Generalized Stirling number triangle of first kind, row n are coefficients of the polynomial P_{n,r}(x) = (-1)^n*((n+r)!/r!)*Product_{k=1..n} (x - 1/(r+k)), with r = 7.
 * @author Sean A. Irvine
 */
public class A051379 extends A051338 {

  @Override
  protected long add() {
    return 7;
  }
}
