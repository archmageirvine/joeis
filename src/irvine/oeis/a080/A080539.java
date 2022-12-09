package irvine.oeis.a080;

import irvine.oeis.NoncomputableSequence;

/**
 * A080539 Number of neutrons in longest known radioactive decay series ending with Lead 208 ("thorium series"), reversed.
 * a(21)=161 inserted to make it consistent with A088055.
 * @author Georg Fischer
 */
public class A080539 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A080539() {
    super(126, 127, 129, 130, 132, 134, 136, 137, 139, 140, 142, 144, 146, 148, 150, 152, 151, 153, 155, 157, 159, 161);
  }
}
