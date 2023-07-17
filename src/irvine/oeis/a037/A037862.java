package irvine.oeis.a037;

/**
 * A037862 a(n)=(number of digits &lt;=1)-(number of digits &gt;1) in base 3 representation of n.
 * @author Sean A. Irvine
 */
public class A037862 extends A037861 {

  /** Construct the sequence. */
  public A037862() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 3;
  }
}
