package irvine.oeis.a048;

/**
 * A048537 a(n) is the smallest value of m such that A002378(m), the m-th oblong number, contains exactly n 4's.
 * @author Sean A. Irvine
 */
public class A048537 extends A048529 {

  @Override
  protected int digit() {
    return 4;
  }
}
