package irvine.oeis.a015;

/**
 * A015991 Numbers such that ten iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015991 extends A015977 {

  /** Construct the sequence. */
  public A015991() {
    super(1);
  }

  @Override
  protected int iterations() {
    return 10;
  }
}
