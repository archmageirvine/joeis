package irvine.oeis.a023;

/**
 * A023101 a(n) is least k such that k and 9k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023101 extends A023094 {

  /** Construct the sequence. */
  public A023101() {
    super(10);
  }

  @Override
  protected int multiple() {
    return 9;
  }
}
