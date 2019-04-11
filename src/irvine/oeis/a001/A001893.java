package irvine.oeis.a001;

/**
 * A001893 Number of permutations of <code>(1,...,n)</code> having <code>n-3</code> inversions <code>(n&gt;=3)</code>.
 * @author Sean A. Irvine
 */
public class A001893 extends A001892 {

  @Override
  protected int delta() {
    return 2;
  }
}
