package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310286 Coordination sequence Gal.5.27.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310286 extends TilingSequence {

  /** Construct the sequence. */
  public A310286() {
    super(0, new String[]
        { "6.6.6;A180+1,B180+2,C300+2"
        , "6.6.3.3;C300+3,A180+2,D60+1,E180+5"
        , "6.6.3.3;E60+2,A60+3,B60+1,E240+4"
        , "6.3.6.3;B300+3,E300+1,B120+3,E120+1"
        , "6.3.3.3.3;D240+4,C300+1,E180+3,C120+4,B180+4"
        });
    defineBaseSet(0);
  }
}
