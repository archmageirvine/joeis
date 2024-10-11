package irvine.oeis.a015;

/**
 * A015979 Three iterations of Reverse and Add are needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A015979 extends A015977 {

  {
    setOffset(1);
  }

  @Override
  protected int iterations() {
    return 3;
  }
}
