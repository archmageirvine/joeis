package irvine.oeis.a066;
// manually tricut2

import irvine.oeis.a000.A000217;
import irvine.oeis.a014.A014132;
import irvine.oeis.triangle.PrependColumn;

/**
 * A066182 Permutation of the integers with cycle form {1}, {3, 2}, {6, 5, 4}, {10, 9, 8, 7}, ...
 * @author Georg Fischer
 */
public class A066182 extends PrependColumn {

  /** Construct the sequence. */
  public A066182() {
    super(1, new A014132(), new A000217() {{
      skip();
    }});
  }
}

