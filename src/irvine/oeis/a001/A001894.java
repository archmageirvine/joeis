package irvine.oeis.a001;

/**
 * A001894 Number of permutations of <code>{1,...,n}</code> having <code>n-4</code> inversions <code>(n&gt;=4)</code>.
 * @author Sean A. Irvine
 */
public class A001894 extends A001892 {

  @Override
  protected int delta() {
    return 3;
  }
}
