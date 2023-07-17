package irvine.oeis.a015;

/**
 * A015982 Five iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015982 extends A015977 {

  /** Construct the sequence. */
  public A015982() {
    super(1);
  }

  @Override
  protected int iterations() {
    return 5;
  }
}
