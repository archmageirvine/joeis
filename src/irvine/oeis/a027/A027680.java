package irvine.oeis.a027;

/**
 * A027680 Number of independent subsets of <code>5^n</code> cube <code>(P_5</code> X ... X <code>P_5)</code>.
 * @author Sean A. Irvine
 */
public class A027680 extends A027667 {

  @Override
  protected int pathLength() {
    return 5;
  }
}
