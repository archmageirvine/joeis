package irvine.oeis.a015;

/**
 * A015993 Twelve iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015993 extends A015977 {

  /** Construct the sequence. */
  public A015993() {
    super(1);
  }

  @Override
  protected int iterations() {
    return 12;
  }
}
