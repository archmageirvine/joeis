package irvine.oeis.a076;

import irvine.oeis.FiniteSequence;

/**
 * A076254 A list of six integers with property that for every 3 numbers a,b,c from the list axbxc is an integer, where <code>axb=a*b/(a+b)</code> and <code>axbxc=a*b*c/(a*b+a*c+b*c)</code>. This is the so-called replus operation.
 * @author Georg Fischer
 */
public class A076254 extends FiniteSequence {

  /** Construct the sequence. */
  public A076254() {
    super(248971642920L, 497943285840L, 746914928760L, 995886571680L, 1493829857520L, 1991773143360L);
  }
}
