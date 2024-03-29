package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310394 Coordination sequence Gal.6.568.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310394 extends TilingSequence {

  /** Construct the sequence. */
  public A310394() {
    super(0, new String[]
        { "6.6.3.3;B60+2,C180+2,B60+1,D0+3"
        , "6.3.3.3.3;A300+3,A300+1,D300+2,B180+4,D300+4"
        , "6.6.3.3;E60+2,A180+2,E60+1,F0+3"
        , "3.3.3.3.3.3;B240+5,B60+3,A0+4,B60+5,B240+3,A180+4"
        , "6.3.3.3.3;C300+3,C300+1,F300+2,F120+6,F300+4"
        , "3.3.3.3.3.3;F180+1,E60+3,C0+4,E60+5,F180+5,E240+4"
        });
    defineBaseSet(0);
  }
}
