package irvine.oeis.a011;

/**
 * A011810 M-sequences from multicomplexes on 4 variables with all monomials of degree 2 but none of degree larger than n.
 * @author Sean A. Irvine
 */
public class A011810 extends A011804 {

  @Override
  protected long variables() {
    return 4;
  }

  @Override
  protected long min() {
    return 2;
  }
}
