package irvine.oeis.a023;

/**
 * A023097 a(n) is least k such that k and 5k are anagrams in base n (written in base 10).
 * @author Sean A. Irvine
 */
public class A023097 extends A023094 {

  /** Construct the sequence. */
  public A023097() {
    super(6);
  }

  @Override
  protected int multiple() {
    return 5;
  }
}
