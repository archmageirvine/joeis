package irvine.oeis.a046;

/**
 * A046403 Numbers with exactly 5 distinct prime factors each of which is a palindrome.
 * @author Sean A. Irvine
 */
public class A046403 extends A046401 {

  @Override
  protected int targetOmega() {
    return 5;
  }
}
