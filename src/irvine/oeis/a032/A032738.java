package irvine.oeis.a032;

/**
 * A032738 <code>a(n)</code> cannot be prefixed or followed by any digit to form a prime <code>('empty'</code> prefixes and suffixes are allowed).
 * @author Sean A. Irvine
 */
public class A032738 extends A032736 {

  private static final String[] SUFFIXES = {"", "1", "3", "7", "9"};

  @Override
  protected String[] suffixes() {
    return SUFFIXES;
  }
}
