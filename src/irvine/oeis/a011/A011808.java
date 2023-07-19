package irvine.oeis.a011;

/**
 * A011808 M-sequences from multicomplexes on at most 11 variables with no monomial of degree more than n-1.
 * @author Sean A. Irvine
 */
public class A011808 extends A011804 {

  /** Construct the sequence. */
  public A011808() {
    super(1);
  }

  @Override
  protected long variables() {
    return 11;
  }
}
