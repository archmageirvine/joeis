package irvine.oeis.a037;

/**
 * A037867 a(n)=(number of digits &lt;=3)-(number of digits &gt;3) in base 8 representation of n.
 * @author Sean A. Irvine
 */
public class A037867 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 8;
  }
}
