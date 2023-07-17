package irvine.oeis.a023;

/**
 * A023099 a(n) is least k such that k and 7k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023099 extends A023094 {

  /** Construct the sequence. */
  public A023099() {
    super(8);
  }

  @Override
  protected int multiple() {
    return 7;
  }
}
