package irvine.oeis.a052;

/**
 * A052211 Numbers k such that k^4 starts with k itself (in base 10).
 * @author Sean A. Irvine
 */
public class A052211 extends A052210 {

  @Override
  protected int power() {
    return 4;
  }
}
