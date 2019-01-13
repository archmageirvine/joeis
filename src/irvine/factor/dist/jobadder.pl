#!/usr/bin/perl
# Passes its argument to the server
use IO::Socket;
use Sys::Hostname;

# server information port information
$server = "localhost";
$serverport = 11711;
$sock = new IO::Socket::INET (PeerAddr => $server,
                              PeerPort => $serverport,
                              Proto     => 'tcp',
                              );
die "Could not connect to server.  Reason: $!\n" unless $sock;

print $sock "$ARGV[0]\n";
while (defined ($buf = <$sock>)) {
    print $buf;
}
close $sock;

print "Ready to work\n";
