package irvine.oeis.a032;

/**
 * A032737 a(n) cannot be prefixed or followed by any digit to form a prime ('empty' suffixes are allowed).
 * @author Sean A. Irvine
 */
public class A032737 extends A032734 {

  /** Construct the sequence. */
  public A032737() {
    super(0);
  }

  private static final String[] SUFFIXES = {"", "1", "3", "7", "9"};

  @Override
  protected String[] suffixes() {
    return SUFFIXES;
  }
}
