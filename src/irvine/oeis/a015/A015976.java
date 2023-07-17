package irvine.oeis.a015;

/**
 * A015976 One iteration of Reverse and Add is needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015976 extends A015977 {

  /** Construct the sequence. */
  public A015976() {
    super(1);
  }

  @Override
  protected int iterations() {
    return 1;
  }
}
