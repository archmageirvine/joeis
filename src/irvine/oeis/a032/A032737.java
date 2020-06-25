package irvine.oeis.a032;

/**
 * A032737 <code>a(n)</code> cannot be prefixed or followed by any digit to form a prime <code>('empty'</code> suffixes are allowed).
 * @author Sean A. Irvine
 */
public class A032737 extends A032734 {

  private static final String[] SUFFIXES = {"", "1", "3", "7", "9"};

  @Override
  protected String[] suffixes() {
    return SUFFIXES;
  }
}
