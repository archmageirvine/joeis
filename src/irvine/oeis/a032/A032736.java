package irvine.oeis.a032;

/**
 * A032736 a(n) cannot be prefixed or followed by any digit to form a prime ('empty' prefixes allowed).
 * @author Sean A. Irvine
 */
public class A032736 extends A032734 {

  private static final String[] PREFIXES = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

  @Override
  protected String[] prefixes() {
    return PREFIXES;
  }
}
