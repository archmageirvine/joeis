package irvine.oeis.a202;
// manually dfinite/holos at 2022-07-30 10:17

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A202839 Number of stacks of length 1 in all 2ndary structures of size n.
 * Recurrence -(n+2)*(406*n-3981)*a(n) +(2022*n^2-15917*n-13552)*a(n-1) +4*(-402*n^2+2594*n+593)*a(n-2) +4*(-605*n^2+7719*n-23415)*a(n-3) +4*(-203*n^2-527*n+15295)*a(n-4) +2*(804*n^2-8404*n+14555)*a(n-5) +(2826*n^2-42913*n+153174)*a(n-6) -(1210*n-6753)*(n-10)*a(n-7)=0.
 * @author Georg Fischer
 */
public class A202839 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A202839() {
    super(0, "[[0],[-67530, 18853,-1210],[153174,-42913, 2826],[29110,-16808, 1608],[61180,-2108,-812],[-93660, 30876,-2420],[2372, 10376,-1608],[-13552,-15917, 2022],[7962, 3169,-406]]", "0, 0, 0, 1, 3, 6, 16, 43, 110, 284", 0);
  }
}
