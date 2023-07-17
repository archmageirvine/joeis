package irvine.oeis.a015;

/**
 * A015990 Nine iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015990 extends A015977 {

  /** Construct the sequence. */
  public A015990() {
    super(1);
  }

  @Override
  protected int iterations() {
    return 9;
  }
}
